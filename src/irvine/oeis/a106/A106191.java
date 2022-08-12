package irvine.oeis.a106;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A106191 Expansion of sqrt(1-4x)/(1-x).
 * Recurrence: <code>a(0)=1, a(1)=-1; for n&gt;1, a(n) = (1/n)*((5*n-6)*a(n-1) - (4*n-6)*a(n-2))</code>.
 * @author Georg Fischer
 */
public class A106191 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A106191() {
    super(0, "[[0],[6,-4],[-6, 5],[0,-1]", "1", 0);
  }
}
