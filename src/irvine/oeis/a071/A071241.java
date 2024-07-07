package irvine.oeis.a071;

import irvine.math.function.Functions;
import irvine.oeis.a014.A014263;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A071147.
 * @author Sean A. Irvine
 */
public class A071241 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A071241() {
    super(1, new A014263(), k -> Functions.REVERSE.z(k).add(k).divide2());
  }
}
