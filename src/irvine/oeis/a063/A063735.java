package irvine.oeis.a063;

import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a005.A005100;

/**
 * A063735 Square deficient numbers.
 * @author Sean A. Irvine
 */
public class A063735 extends FilterSequence {

  /** Construct the sequence. */
  public A063735() {
    super(new A005100(), Z::isSquare);
  }
}
