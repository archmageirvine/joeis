package irvine.oeis.a390;

import irvine.oeis.ComplementSequence;
import irvine.oeis.a393.A393168;

/**
 * A390380 Integers k which cannot be written in the form x^2 + y^2 - z^2, where x, y, z are integers and x^2, y^2, z^2 &lt;= k.
 * @author Sean A. Irvine
 */
public class A390380 extends ComplementSequence {

  /** Construct the sequence. */
  public A390380() {
    super(new A393168());
  }
}
