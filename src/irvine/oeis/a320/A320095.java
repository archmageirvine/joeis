package irvine.oeis.a320;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a143.A143325;
import irvine.oeis.triangle.UpperLeftTriangle;

/**
 * A320095 Number of primitive (=aperiodic) n-ary words with length less than or equal to n which are earlier in lexicographic order than any other word derived by cyclic shifts of the alphabet.
 * which are earlier in lexicographic order than any other word derived by cyclic shifts of the alphabet.
 * a(n) = Sum_{j=1..n} A143325(j,n).
 * @author Georg Fischer
 */
public class A320095 implements Sequence {

  private int mN;
  private UpperLeftTriangle mULT;

  /** Construct the sequence. */
  public A320095() {
    mN = 0;
    mULT = new A143325();
  }

  @Override
  public Z next() {
    ++mN;
    return Integers.SINGLETON.sum(1, mN, j -> mULT.matrixElement(j, mN));
  }
}
