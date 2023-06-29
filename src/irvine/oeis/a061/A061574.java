package irvine.oeis.a061;

import irvine.oeis.PrependSequence;
import irvine.oeis.a003.A003172;

/**
 * A061574 Simple quadratic fields (i.e., with a unique prime factorization).
 * @author Sean A. Irvine
 */
public class A061574 extends PrependSequence {

  /** Construct the sequence. */
  public A061574() {
    super(-9, new A003172(), -163, -67, -43, -19, -11, -7, -3, -2, -1, 1);
  }
}

