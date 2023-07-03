package irvine.oeis.a063;

import irvine.oeis.InverseSequence;
import irvine.oeis.SkipSequence;

/**
 * A063378 Smallest number whose Sophie Germain degree (see A063377) is n.
 * @author Sean A. Irvine
 */
public class A063378 extends InverseSequence {

  /** Construct the sequence. */
  public A063378() {
    super(0, new SkipSequence(new A063377(), 1), 0, 2);
  }
}
