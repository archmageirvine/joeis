package irvine.oeis.a003;

/**
 * A003005 Size of the largest subset of the numbers <code>[1</code>...n] which doesn't contain a 6-term arithmetic progression.
 * @author Sean A. Irvine
 */
public class A003005 extends A003003 {

  @Override
  protected int getProgressionLength() {
    return 6;
  }
}

