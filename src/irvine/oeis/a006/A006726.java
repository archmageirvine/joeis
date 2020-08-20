package irvine.oeis.a006;

import irvine.math.Polyomino;
import irvine.math.z.Z;
import irvine.oeis.a000.A000105;

/**
 * A006726 Number of n-celled polygons with perimeter <code>2n</code> on square lattice.
 * @author Sean A. Irvine
 */
public class A006726 extends A000105 {

  {
    super.next();
    super.next();
    super.next();
    super.next();
  }

  @Override
  protected Polyomino canonicalize(final Polyomino polyomino) {
    return polyomino.translate();
  }

  @Override
  public Z next() {
    super.next();
    long c = 0;
    for (final Polyomino p : mA) {
      if (p.perimeter() == 2 * p.size()) {
        ++c;
      }
    }
    return Z.valueOf(c);
  }
}
// todo
//public class A006726 implements Sequence {
//
//  private final ParallelHunter mHunter = new ParallelHunter(6,
//    () -> new Hunter(Lattices.Z2, true),
//    () -> new Hunter(Lattices.Z2, true) {
//      {
//        setKeeper(new Keeper() {
//          @Override
//          public void process(final Animal animal, final Set<Long> forbidden) {
//            System.out.println(animal.toString(Lattices.Z2) + " -> " + animal.perimeterSize(Lattices.Z2));
//            if (animal.perimeterSize(Lattices.Z2) == 2 * animal.size()) {
//              increment(1);
//            }
//          }
//        });
//      }
//    }
//  );
//
//  private int mN = 3;
//
//  @Override
//  public Z next() {
//    return Z.valueOf(mHunter.count(++mN));
//  }
//}
