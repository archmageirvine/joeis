package irvine.oeis.a034;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A034992 a(n)^2 is smallest square number starting with a string of n 8's.
 * @author Sean A. Irvine
 */
public class A034992 extends A034982 {

  /** Construct the sequence. */
  public A034992() {
    super(new DecimalExpansionSequence(CR.valueOf(new Q(8, 9)).sqrt()),
      new DecimalExpansionSequence(CR.valueOf(new Q(8, 90)).sqrt()), "8", "");
  }
}
