package irvine.oeis.a034;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A034990 a(n)^2 is smallest square starting with a string of n 7's.
 * @author Sean A. Irvine
 */
public class A034990 extends A034982 {

  /** Construct the sequence. */
  public A034990() {
    super(new DecimalExpansionSequence(CR.valueOf(new Q(7, 9)).sqrt()),
      new DecimalExpansionSequence(CR.valueOf(new Q(7, 90)).sqrt()), "7", "");
  }
}
