package irvine.oeis.a393;

import irvine.math.z.Z;
import irvine.oeis.MultiplicativeSequence;

/**
 * A393491 allocated for Werner Schulte.
 * @author Sean A. Irvine
 */
public class A393491 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A393491() {
    super(1, (p, e) -> Z.valueOf((e + 1) / 3));
  }
}

