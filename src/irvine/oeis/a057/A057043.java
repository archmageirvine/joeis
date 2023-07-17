package irvine.oeis.a057;
// manually A057036/parmof4 at 2023-07-17 09:13

import irvine.math.z.Z;
import irvine.oeis.a000.A000032;

/**
 * A057043 Let R(i,j) be the rectangle with antidiagonals 1; 2,3; 4,5,6; ...; each k is an R(i(k),j(k)) and A057043(n)=i(L(n)), where L(n) is the n-th Lucas number.
 * @author Georg Fischer
 */
public class A057043 extends A057036 {

  protected int mN = 0;

  /** Construct the sequence. */
  public A057043() {
    super(1, new A000032(), 1, 0);
  }

  @Override
  public Z next() {
    ++mN;
    return super.next().add(mN == 2 ? 1 : 0);
  }
}

