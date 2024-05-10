package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A068053 Start with one 1 in the infinite vector of zeros, shift one right or left and sum mod 2 (bitwise-XOR) to get 11, then shift two steps and XOR to get 1111, then three steps and XOR to get 1110111, then four steps and so on.
 * @author Sean A. Irvine
 */
public class A068053 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A068053() {
    super(0, new A068052(), k -> new Z(k.toString(2)));
  }
}

