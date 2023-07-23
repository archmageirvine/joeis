package irvine.oeis.a033;

import irvine.oeis.InverseSequence;
import irvine.oeis.a030.A030168;

/**
 * A033309 Position of first occurrence of n in continued fraction for Copeland-Erd\u0151s constant.
 * @author Sean A. Irvine
 */
public class A033309 extends InverseSequence {

  /** Construct the sequence. */
  public A033309() {
    super(new A030168(), 1, 1);
  }
}
