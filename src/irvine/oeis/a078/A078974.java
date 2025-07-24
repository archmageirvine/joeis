package irvine.oeis.a078;

import irvine.oeis.a084.A084256;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A078974 Decimal expansion of constant C such that Sum_{k&gt;=1} 1/C^p(k) = 1 where p(k) is the k-th prime.
 * @author Sean A. Irvine
 */
public class A078974 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A078974() {
    super(1, new A084256().getCR().inverse());
  }
}
