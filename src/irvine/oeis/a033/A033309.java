package irvine.oeis.a033;

import irvine.oeis.PositionOfNSequence;
import irvine.oeis.a030.A030168;

/**
 * A033309 Position of first occurrence of n in continued fraction for <code>Copeland-Erd\u0151s</code> constant.
 * @author Sean A. Irvine
 */
public class A033309 extends PositionOfNSequence {

  /** Construct the sequence. */
  public A033309() {
    super(new A030168());
  }
}
