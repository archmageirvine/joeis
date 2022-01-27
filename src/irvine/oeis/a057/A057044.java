package irvine.oeis.a057;
// manually A057036/parm4 at 2022-01-27 20:25

import irvine.math.z.Z;
import irvine.oeis.a000.A000032;

/**
 * A057044 Let R(i,j) be the rectangle with antidiagonals 1; 2, 3; 4, 5, 6; ...; each k is an R(i(k),j(k)) and A057044(n)=j(L(n)), where L(n) is the n-th Lucas number.
 * @author Georg Fischer
 */
public class A057044 extends A057036 {


  protected int mN = 0;

  /** Construct the sequence. */
  public A057044() {
    super(new A000032(), 2, 0);
  }

  @Override
  public Z next() {
    ++mN;
    return super.next().add(mN == 2 ? -2 : 0);
  }
}
