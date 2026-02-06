package irvine.oeis.a393;

import irvine.oeis.InverseSequence;
import irvine.oeis.a024.A024360;

/**
 * A393121 allocated for Lorenzo Sauras Altuzarra.
 * @author Sean A. Irvine
 */
public class A393121 extends InverseSequence {

  /** Construct the sequence. */
  public A393121() {
    super(1, new A024360());
  }
}
