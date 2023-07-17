package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.a060.A060158;

/**
 * A000486 One half of the number of permutations of [n] such that the differences have 4 runs with the same signs.
 * @author Sean A. Irvine
 */
public class A000486 extends A060158 {

  /** Construct the sequence. */
  public A000486() {
    super(5);
  }

  {
    super.next();
    super.next();
    super.next();
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
