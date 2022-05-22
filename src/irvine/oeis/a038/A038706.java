package irvine.oeis.a038;

import irvine.oeis.InverseSequence;
import irvine.oeis.a030.A030167;

/**
 * A038706 Position of the first occurrence of n in continued fraction for Champernowne constant (A030167).
 * @author Sean A. Irvine
 */
public class A038706 extends InverseSequence {

  /** Construct the sequence. */
  public A038706() {
    super(new A030167(), 1);
  }
}
