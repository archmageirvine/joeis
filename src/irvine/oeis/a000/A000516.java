package irvine.oeis.a000;

/**
 * A000516.
 * @author Sean A. Irvine
 */
public class A000516 extends A000512 {

  @Override
  protected boolean checkColumns(final int[] m) {
    final int p = pop();
    for (int s = 0; s < m.length; ++s) {
      int c = 0;
      for (final int v : m) {
        c += (v >>> s) & 1;
      }
      if (c > p) {
        return false;
      }
    }
    return true;
    /*

    final int[] c = new int[m.length];
    for (int v : m) {
      for (int j = 0; j < c.length; ++j) {
        if ((v & 1) != 0 && ++c[j] > p) {
          return false;
        }
        v >>>= 1;
      }
    }
    return true;
    */
  }

  @Override
  protected int pop() {
    return 5;
  }

}
