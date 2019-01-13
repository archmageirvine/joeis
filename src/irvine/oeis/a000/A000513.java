package irvine.oeis.a000;

/**
 * A000513.
 * @author Sean A. Irvine
 */
public class A000513 extends A000512 {

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
  }

  @Override
  protected int pop() {
    return 4;
  }

}
