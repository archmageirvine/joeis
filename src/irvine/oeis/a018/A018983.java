package irvine.oeis.a018;

/**
 * A018983 Cycle class sequence <code>c(2n)</code> (the number of true cycles of length <code>2n</code> in which a certain node is included) for zeolite ATN <code>= MAPO-39 Hn [ MgnAl8-n P8O32 ]</code>.
 * @author Sean A. Irvine
 */
public class A018983 extends A018940 {

  @Override
  protected String getNeighbourhoodDescription() {
    // ATN
    return "a-1: a-8(000) a-8(--0) a-7(000) a-6(000)\n"
      + "a-2: a-8(000) a-6(00-) a-5(0+0) a-5(-00)\n"
      + "a-3: a-8(000) a-7(++0) a-7(000) a-5(000)\n"
      + "a-4: a-7(000) a-6(+00) a-6(0-0) a-5(00+)\n";
  }
}

