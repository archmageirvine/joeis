package irvine.oeis.a019;

/**
 * A019005 Cycle class sequence c(2n) (the number of true cycles of length 2n in which a certain node is included) for zeolite DFO = DAF-1 [Mg14Al52P66O264].7R.40 H2O starting with a T3 atom.
 * @author Sean A. Irvine
 */
public class A019005 extends A019004 {

  @Override
  protected String startNode() {
    return "c-3";
  }
}

