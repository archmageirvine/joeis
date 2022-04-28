package irvine.oeis.a243;
// manually deris/essent at 2022-04-28 15:40

import irvine.oeis.PrependSequence;
import irvine.oeis.a048.A048896;

/**
 * A243036 Number of entries of length n in A240602.
 * @author Georg Fischer
 */
public class A243036 extends PrependSequence {

  /** Construct the sequence. */
  public A243036() {
    super(1, new A048896(), 2);
  }
}
