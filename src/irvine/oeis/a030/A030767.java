package irvine.oeis.a030;

/**
 * A030767 Row 1, where, at stage k&gt;1, write i in row 1 and j in row 2, where i is number of j's in rows 1 and 2, for j=m,m-1,...2,1, where m=max number in row 1 from stages 1 to k-1; stage 1 is 2 in row 1.
 * @author Sean A. Irvine
 */
public class A030767 extends A030757 {

  @Override
  protected long initialTerm() {
    return 2;
  }
}

