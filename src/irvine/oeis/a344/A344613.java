package irvine.oeis.a344;
// manually 2021-06-15

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a001.A001190;
import irvine.oeis.a085.A085748;

/**
 * A344613 Number of rooted binary trees (in which all inner nodes have precisely two children) with n leaves and with maximal number of cherries (i.e., maximal number of pendant subtrees with two leaves).
 * a(n) = A001190(n/2) if n even, otherwise a(n) = A085748((n-1)/2).
 * @author Georg Fischer
 */
public class A344613 extends A001190 {

  private int mN;
  private Sequence mA085748;
  
  /** Construct the sequence. */
  public A344613() {
    setOffset(1);
    mN = 0;
    super.next(); // skip a(0)
    mA085748 = new A085748();
  }

/*
A085748 = 0, 1, 1, 2, 4, 9, 20, 46, 106, 248, 582, 1376
A001190 = 0, 1, 1, 1, 2, 3,  6, 11,  23,  46,  98,  207
A344613 =    1, 1, 1, 1, 2,  1,  4,   2,   9,   3,   20
*/
  @Override
  public Z next() {
    ++mN;
    return (mN & 1) == 1 ? mA085748.next() : super.next();
  }
}
