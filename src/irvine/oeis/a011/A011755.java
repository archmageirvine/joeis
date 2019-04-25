package irvine.oeis.a011;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.a002.A002618;

/**
 * A011755 <code>a(n) = Sum_{k=1..n}</code> k*phi(k).
 * @author Sean A. Irvine
 */
public class A011755 extends PartialSumSequence {

  /** Construct the sequence. */
  public A011755() {
    super(new A002618());
  }
}
