package irvine.oeis.a006;

import irvine.oeis.UnionSequence;
import irvine.oeis.a048.A048700;
import irvine.oeis.a048.A048701;

/**
 * A006995 Binary palindromes: numbers whose binary expansion is palindromic.
 * @author Sean A. Irvine
 */
public class A006995 extends UnionSequence {

  /** Construct the sequence. */
  public A006995() {
    super(new A048700(), new A048701());
  }
}
