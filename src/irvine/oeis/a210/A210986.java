package irvine.oeis.a210;
// manually n2/n2add1 at 2022-04-08 11:54

import irvine.math.z.Z;
import irvine.oeis.a001.A001168;

/**
 * A210986 Number of fixed polyominoes with 2n cells.
 * @author Georg Fischer
 */
public class A210986 extends A001168 {

  /** Construct the sequence. */
  public A210986() {
    super(1);
  }

  {
    super.next();
  }

  @Override
  public Z next() {
    super.next();
    return super.next();
  }
}
