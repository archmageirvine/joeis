package irvine.oeis.a003;

/**
 * A003004 Size of the largest subset of the numbers [1..n] which does not contain a 5-term arithmetic progression.
 * @author Sean A. Irvine
 */
public class A003004 extends A003003 {

  @Override
  protected int getProgressionLength() {
    return 5;
  }
}

