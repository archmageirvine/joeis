package irvine.oeis.a142;

import irvine.math.z.Z;
import irvine.oeis.a000.A000032;

/**
 * A142584 a(n) = A014217(n+1) - A115360(n+2).
 * @author Georg Fischer
 */
public class A142584 extends A000032 {

  private int mN = 0;

  {
    super.next();
    super.next();
  }

  @Override
  public int getOffset() {
    return 1;
  }

  @Override
  public Z next() {
    // a(n) = Lucas(n+1) - (1/2)*(1 + (-1)^((n+2) mod 3)).
    ++mN;
    return super.next().subtract((1 + ((((mN + 2) % 3) & 1) == 0 ? 1 : -1)) / 2);
  }
}
