package irvine.oeis.a025;

import irvine.math.z.Z;
import irvine.oeis.a194.A194543;

/**
 * A025162 Number of partitions of n with distinct parts p(i) such that if i != j, then |p(i) - p(j)| &gt;= 8.
 * @author Sean A. Irvine
 */
public class A025162 extends A194543 {

  /** Construct the sequence. */
  public A025162() {
    super(1);
  }

  private int mN = 0;

  @Override
  public Z next() {
    return t(++mN, 8);
  }
}
