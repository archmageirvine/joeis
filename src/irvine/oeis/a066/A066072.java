package irvine.oeis.a066;

import irvine.math.function.Functions;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A066072 Prime numbers arising in A066071.
 * @author Sean A. Irvine
 */
public class A066072 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A066072() {
    super(1, new A066071(), k -> {
      return Functions.PHI.z(k).add(1);
    });
  }
}
