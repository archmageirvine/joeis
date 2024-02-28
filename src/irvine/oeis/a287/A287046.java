package irvine.oeis.a287;

import irvine.math.z.Z;
import irvine.oeis.a269.A269920;

/**
 * A287046 a(n) is the number of rooted maps with n edges and 6 faces on an orientable surface of genus 1.
 * @author Georg Fischer
 */
public class A287046 extends A269920 {

  private int mN; // edges
  private int mG; // genus
  private int mF; // faces

  /** Construct the sequence. */
  public A287046() {
    this(7, 6, 1);
  }

  /**
   * Generic constructor with parameters.
   * @param offset first index
   * @param f number of faces
   */
  public A287046(final int offset, final int f, final int g) {
    super(offset);
    mN = offset - 1;
    mG = g;
    mF = f;
  }

  //  protected Z compute(final int n, final int g, final int f) {

  @Override
  public Z next() {
    ++mN;
    return get(mN, mG, mF);
  }
}
