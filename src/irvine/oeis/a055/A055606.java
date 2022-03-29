package irvine.oeis.a055;

/**
 * A055606 Largest k value that admits an (n,k) balanced magic carpet.
 * @author Sean A. Irvine
 */
public class A055606 extends A055057 {

  {
    super.next();
  }

  @Override
  protected boolean isAccept(final int n, final long[] sets) {
    // Check all sets have the same size
    final int cnt = Long.bitCount(sets[0]);
    for (int k = 1; k < sets.length; ++k) {
      if (Long.bitCount(sets[k]) != cnt) {
        return false;
      }
    }
    return super.isAccept(n, sets);
  }
}
