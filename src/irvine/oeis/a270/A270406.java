package irvine.oeis.a270;

import irvine.math.z.Z;
import irvine.oeis.a269.A269920;

/**
 * A270406 Triangle read by rows: T(n,g) is the number of rooted maps with n edges and 2 faces on an orientable surface of genus g.
 * @author Georg Fischer
 */
public class A270406 extends A269920 {

  private int mN; // edges
  private int mG; // genus
  private final int mF; // faces

  /** Construct the sequence. */
  public A270406() {
    this(1, 2);
  }

  /**
   * Generic constructor with parameters.
   * @param offset first index
   * @param f number of faces
   */
  public A270406(final int offset, final int f) {
    super(offset);
    mN = offset;
    mF = f;
    mG = -1;
  }

  @Override
  public Z next() {
    if (++mG > (mN + 3 - mF) / 2 - 1) {
      ++mN;
      mG = 0;
    }
    return get(mN, mG, mF);
  }

}
