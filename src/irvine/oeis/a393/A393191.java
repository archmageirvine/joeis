package irvine.oeis.a393;

import irvine.oeis.Combiner;
import irvine.oeis.a006.A006905;
import irvine.oeis.a391.A391878;

/**
 * A392125 allocated for Clark Kimberling.
 * @author Sean A. Irvine
 */
public class A393191 extends Combiner {

  /** Construct the sequence. */
  public A393191() {
    super(0, new A006905(), new A391878(), SUBTRACT);
  }
}
