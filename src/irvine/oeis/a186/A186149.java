package irvine.oeis.a186;

import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A186149 Rank of n^2 when {(1/4)i^3: i&gt;=1} and {j^2&gt;: j&gt;=1} are jointly ranked with (1/4)i^3 before j^2 when  (1/4)i^3=j^2.  Complement of A186148.
 * @author Georg Fischer
 */
public class A186149 extends A186148 {

  /** Construct the sequence. */
  public A186149() {
    this(1, new Q(1, 8), new Q(1, 4), new Q(1), 3, 2);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param d discriminating value
   * @param u first base
   * @param v second base
   * @param p first exponent
   * @param q second exponent
   */
  public A186149(final int offset, final Q d, final Q u, final Q v, final int p, final int q) {
    super(offset, d, u, v, p, q);
  }

  /*
  d=1/8; u=1/4; v=1; p=3; q=2;
  h[n_]:=((u*n^p-d)/v)^(1/q);
  a[n_]:=n+Floor[h[n]]; (* rank of u*n^p *)
  k[n_]:=((v*n^q+d)/u)^(1/p);
  b[n_]:=n+Floor[k[n]]; (* rank of v*n^q *)
  */
  @Override
  public Z next() {
    ++mN;
    return mV.multiply(Z.valueOf(mN).pow(mQ)).add(mD).divide(mU).pow(new Q(1, mP)).floor().add(mN);
  }
}
