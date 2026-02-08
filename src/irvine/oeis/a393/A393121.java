package irvine.oeis.a393;

import irvine.oeis.InverseSequence;
import irvine.oeis.a024.A024360;

/**
 * A393121 a(n) is the least k for which A024360(k) = n, or a(n) = -1 if such k does not exist.
 * @author Sean A. Irvine
 */
public class A393121 extends InverseSequence {

  /** Construct the sequence. */
  public A393121() {
    super(1, new A024360());
  }
}
