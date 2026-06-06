package irvine.oeis.a085;

import irvine.math.function.Functions;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A085187 Sequence A085188 shown in factorial base. (The longest prefix which can be shown with digits &lt; 10.).
 * @author Sean A. Irvine
 */
public class A085187 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A085187() {
    super(0, new A085188(), Functions.FACTORIAL_BASE::z);
  }
}
