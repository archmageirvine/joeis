package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A080070 Decimal encoding of parenthesizations produced by simple iteration starting from empty parentheses and where each successive parenthesization is obtained from the previous by reflecting it as a general tree/parenthesization, then adding an extra stem below the root and then reflecting the underlying binary tree.
 * @author Sean A. Irvine
 */
public class A080070 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A080070() {
    super(new A080069(), k -> new Z(k.toString(2)));
  }
}

