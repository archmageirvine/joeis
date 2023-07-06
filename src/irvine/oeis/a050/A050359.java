package irvine.oeis.a050;

import irvine.oeis.NestedSequence;
import irvine.oeis.a025.A025487;

/**
 * A050359 Number of ordered factorizations with 3 levels of parentheses indexed by prime signatures: A050358(A025487(n)).
 * @author Sean A. Irvine
 */
public class A050359 extends NestedSequence {

  /** Construct the sequence. */
  public A050359() {
    super(1, new A050358(), new A025487(), 1, 1);
  }
}
