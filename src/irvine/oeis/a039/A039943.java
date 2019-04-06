package irvine.oeis.a039;

import irvine.oeis.FiniteSequence;

/**
 * A039943 Every integer eventually goes to one of these under the &quot;x goes to sum of squares of digits of x&quot; map.
 * @author Georg Fischer
 */
public class A039943 extends FiniteSequence {

  /** Construct the sequence. */
  public A039943() {
    super(0, 1, 4, 16, 20, 37, 42, 58, 89, 145);
  }
}
