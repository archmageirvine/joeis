package irvine.oeis.a253;
// manually divmul at 2021-08-20 23:36

import irvine.math.z.Z;
import irvine.oeis.a001.A001045;

/**
 * A253103 A001045(n)^3.
 * @author Georg Fischer
 */
public class A253103 extends A001045 {

  /** Construct the sequence. */
  public A253103() {
    super(2);
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    return super.next().pow(3);
  }
}
