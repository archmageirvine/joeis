package irvine.oeis.a002;

import irvine.math.z.Z;

/**
 * A002014 Number of symmetric filaments with n square cells.
 * @author Sean A. Irvine
 */
@SuppressWarnings("RedundantIfStatement")
public class A002014 extends A002013 {

  private boolean symmetricOrigin(final Animal a, final Animal b) {
    return a.equals(b) || A002013.swapOrigin(null, a, 0, 0).equals(b);
  }

  private boolean symmetricFlip(final Animal a, final Animal b) {
    return symmetricOrigin(a, b)
      || symmetricOrigin(verticalFlip(null, a, 0, 0), b)
      || symmetricOrigin(horizontalFlip(null, a, 0, 0), b);
  }

  private boolean symmetric(final Animal animal) {
    if (symmetricFlip(A002013.oneEighty(animal), animal)) {
      return true;
    }
    if (symmetricFlip(A002013.ninety(animal), animal)) {
      return true;
    }
    if (symmetricFlip(A002013.twoSeventy(animal), animal)) {
      return true;
    }
    return false;
  }

  @Override
  public Z next() {
    if (super.next().equals(Z.ONE)) {
      return Z.ONE;
    }
    long c = 0;
    for (final Animal a : mAnimals) {
      if (symmetric(a)) {
        ++c;
      }
    }
    return Z.valueOf(c);
  }
}
