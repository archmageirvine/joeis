package irvine.oeis.a010;
// manually 2021-06-17

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.HolonomicRecurrence;

/**
 * A010085 Weight distribution of [15,11,3] Hamming code of length 15 and minimal distance 3.
 * @author Georg Fischer
 */
public class A010085 extends HolonomicRecurrence {

  protected int mN;
  protected int mLen; // (length of the code - 1)/2

  /** Construct the sequence. */
  public A010085() {
    this(15);
  } 
  
  /**
   * General constructor with parameter
   * @param m length of the Hamming code (2^k-1).
   * Recurrence: n*a(n) = binomial(m, n-1) - a(n-1) - (m-n+2)*a(n-2)
   */
  public A010085(final int m) {
    super(0
      , new ArrayList<Z[]>() {{
        // [[0],[-(m+3)*(m+2), 2*m+5,-1],[-2*m-4, 4+m,-1],[m+1,-m-2, 1],[0,-1, 1]]
        add(new Z[]{Z.ZERO});
        add(new Z[]{Z.valueOf(-(m + 3) * (m + 2)), Z.valueOf(2 * m + 5), Z.NEG_ONE});
        add(new Z[]{Z.valueOf(-2 * m - 4), Z.valueOf(4 + m), Z.NEG_ONE});
        add(new Z[]{Z.valueOf(m + 1), Z.valueOf(-m - 2), Z.ONE});
        add(new Z[]{Z.ZERO, Z.NEG_ONE, Z.ONE});
      }}
      , new Z[]{Z.ONE, Z.ZERO});
    mN = -1;
    mLen = m;
  }

  @Override
  public Z next() {
    ++mN;
    return mN < mLen + 1 ? super.next() : null; // b.o. "fini"
  }
}
