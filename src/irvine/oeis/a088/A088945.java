package irvine.oeis.a088;

import irvine.oeis.LinearRecurrence;

/**
 * A088945 <code>a(n) =60*sum(1&lt;=u&lt;=v&lt;=w&lt;=m,u^2*v^2/w)</code>.
 * @author Sean A. Irvine
 */
public class A088945 extends LinearRecurrence {

  /** Construct the sequence. */
  public A088945() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 60, 690, 3630, 13035, 37059, 89839});
  }
}
