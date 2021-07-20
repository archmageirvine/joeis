package irvine.oeis.a002;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002013 Filaments with n square cells.
 * @author Sean A. Irvine
 */
public class A002013 implements Sequence {

  static class Animal {

    private final Animal mParent;
    private final int mX;
    private final int mY;
    private final boolean mUpSeen;
    private final int mHashCode;

    Animal(final Animal parent, final int x, final int y) {
      mParent = parent;
      mX = x;
      mY = y;
      mUpSeen = parent != null && (mParent.mUpSeen || y > mParent.mY);
      mHashCode = (parent != null ? 3 * mParent.mHashCode : 0) ^ ((mX << 16) + mY);
    }

    private boolean contains(final int x, final int y) {
      return (mX == x && mY == y) || (mParent != null && mParent.contains(x, y));
    }

    @Override
    public boolean equals(final Object o) {
      if (!(o instanceof Animal)) {
        return false;
      }
      final Animal a = (Animal) o;
      if (a.mX != mX || a.mY != mY) {
        return false;
      }
      if (mParent == null) {
        return a.mParent == null;
      }
      return mParent.equals(a.mParent);
    }

    @Override
    public int hashCode() {
      return mHashCode;
    }

    @Override
    public String toString() {
      return (mParent == null ? "" : mParent.toString() + "-") + "(" + mX + "," + mY + ")";
    }

    void draw(final PrintStream out) {
      int minx = 0;
      int maxx = 0;
      int miny = 0;
      int maxy = 0;
      Animal a = this;
      while (a != null) {
        if (a.mX > maxx) {
          maxx = a.mX;
        }
        if (a.mX < minx) {
          minx = a.mX;
        }
        if (a.mY > maxy) {
          maxy = a.mY;
        }
        if (a.mY < miny) {
          miny = a.mY;
        }
        a = a.mParent;
      }
      final char[][] pic = new char[maxy - miny + 1][maxx - minx + 1];
      for (final char[] row : pic) {
        Arrays.fill(row, ' ');
      }
      a = this;
      while (a != null) {
        pic[a.mY - miny][a.mX - minx] = '*';
        a = a.mParent;
      }
      for (final char[] row : pic) {
        out.println(new String(row));
      }
    }
  }

  private int mN = -1;
  protected final HashSet<Animal> mAnimals = new HashSet<>();

  private Animal legal(final Animal animal, final int x, final int y) {
    if (animal.contains(x, y)) {
      return null;
    }
    int neighbours = 0;
    if (animal.contains(x - 1, y)) {
      ++neighbours;
    }
    if (animal.contains(x, y - 1) && ++neighbours > 1) {
      return null;
    }
    if (animal.contains(x + 1, y) && ++neighbours > 1) {
      return null;
    }
    if (animal.contains(x, y + 1) && ++neighbours > 1) {
      return null;
    }
    assert neighbours == 1;
    return new Animal(animal, x, y);
  }

  static Animal ninety(final Animal a) {
    return a == null ? null : new Animal(ninety(a.mParent), -a.mY, a.mX);
  }

  static Animal oneEighty(final Animal a) {
    return a == null ? null : new Animal(oneEighty(a.mParent), -a.mX, -a.mY);
  }

  static Animal twoSeventy(final Animal a) {
    return a == null ? null : new Animal(twoSeventy(a.mParent), a.mY, -a.mX);
  }

  static Animal verticalFlip(final Animal parent, final Animal a, final int dx, final int dy) {
    final Animal b = new Animal(parent, dx, dy);
    if (a.mParent == null) {
      return b;
    }
    return verticalFlip(b, a.mParent, dx + a.mParent.mX - a.mX, dy + a.mY - a.mParent.mY);
  }

  static Animal horizontalFlip(final Animal parent, final Animal a, final int dx, final int dy) {
    final Animal b = new Animal(parent, dx, dy);
    if (a.mParent == null) {
      return b;
    }
    return horizontalFlip(b, a.mParent, dx + a.mX - a.mParent.mX, dy + a.mParent.mY - a.mY);
  }

  static Animal swapOrigin(final Animal parent, final Animal a, final int dx, final int dy) {
    final Animal b = new Animal(parent, dx, dy);
    if (a.mParent == null) {
      return b;
    }
    return swapOrigin(b, a.mParent, dx + a.mParent.mX - a.mX, dy + a.mParent.mY - a.mY);
  }

  private boolean alreadyPresentUpToOrigin(final Animal animal) {
    return mAnimals.contains(animal) || mAnimals.contains(swapOrigin(null, animal, 0, 0));
  }

  private boolean addUnderRotation(final Animal animal) {
    return !alreadyPresentUpToOrigin(animal)
      && !alreadyPresentUpToOrigin(ninety(animal))
      && !alreadyPresentUpToOrigin(oneEighty(animal))
      && !alreadyPresentUpToOrigin(twoSeventy(animal));
  }

  private void addUnderSymmetry(final Animal animal) {
    if (addUnderRotation(animal)
        && addUnderRotation(verticalFlip(null, animal, 0, 0))
        && addUnderRotation(horizontalFlip(null, animal, 0, 0))) {
      mAnimals.add(animal);
    }
  }

  private void generate(final Animal animal, final int n) {
    if (animal == null) {
      return;
    }
    if (n == 0) {
      addUnderSymmetry(animal);
      return;
    }
    // Consider four possible directions in turn
    generate(legal(animal, animal.mX + 1, animal.mY), n - 1);
    generate(legal(animal, animal.mX, animal.mY + 1), n - 1);
    if (animal.mUpSeen) { // first turn (if any) must be upwards
      generate(legal(animal, animal.mX - 1, animal.mY), n - 1);
      generate(legal(animal, animal.mX, animal.mY - 1), n - 1);
    }
  }

  private static final Animal START = new Animal(new Animal(null, 0, 0), 1, 0);

  @Override
  public Z next() {
    if (++mN < 3) {
      return Z.ONE;
    }
    mAnimals.clear();
    generate(START, mN - 2); // start with 2 cells filled
    /*
    System.out.println(mAnimals);
    for (final Animal a : mAnimals) {
      a.draw(System.out);
      System.out.println("----------------");
    }
    */
    return Z.valueOf(mAnimals.size());
  }
}
