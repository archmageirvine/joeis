package irvine.oeis.a086;
// manually deris/eulerix 0 at 2021-12-09 19:40

import irvine.oeis.PrependSequence;
import irvine.oeis.a001.A001174;
import irvine.oeis.transform.InverseEulerTransform;

/**
 * A086345 Number of connected oriented graphs (i.e., connected directed graphs with no bidirected edges) on n nodes.
 * @author Georg Fischer
 */
public class A086345 extends PrependSequence {

  /** Construct the sequence. */
  public A086345() {
    super(new InverseEulerTransform(new A001174()), 1);
  }
}
