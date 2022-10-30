package irvine.oeis.a078;
// manually deris/partprod at 2022-10-26 11:22

import irvine.oeis.PartialProductSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a079.A079069;

/**
 * A078919 Partial products of A079069.
 * @author Georg Fischer
 */
public class A078919 extends PartialProductSequence {

  /** Construct the sequence. */
  public A078919() {
    super(1, new PrependSequence(0, new A079069(), 1));
  }
}
