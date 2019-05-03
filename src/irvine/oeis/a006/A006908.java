package irvine.oeis.a006;

/**
 * A006908 Number of nonzero elements in the character table of the symmetric group <code>S_n</code>.
 * @author Sean A. Irvine
 */
public class A006908 extends A006907 {

  @Override
  protected boolean accept(final int v) {
    return v != 0;
  }
}
