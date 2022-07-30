package irvine.oeis.a191;
// manually dfinite/holos at 2022-07-30 11:44

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A191789 Number of length n left factors of Dyck paths having no base pyramids.
 * recurrence -94*(n+1)*(n-15)*a(n) +2*(-47*n^2+734*n-2115)*a(n-1) +8*(88*n^2-1311*n+1307)*a(n-2) +2*(235*n^2-3904*n+13597)*a(n-3) +(-1593*n^2+25078*n-72033)*a(n-4) +(-423*n^2+7074*n-25079)*a(n-5) +(1241*n^2-19834*n+66805)*a(n-6) +2*(94*n^2-1585*n+5741)*a(n-7) -4*(n-7)*(117*n-1087)*a(n-8)=0.
 * @author Georg Fischer
 */
public class A191789 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A191789() {
    super(0, "[[0],[-30436, 7624,-468],[11482,-3170, 188],[66805,-19834, 1241],[-25079, 7074,-423],[-72033, 25078,-1593],[27194,-7808, 470],[10456,-10488, 704],[-4230, 1468,-94],[1410, 1316,-94]]",
      "1, 1, 1, 2, 3, 6, 11, 21, 40, 76, 146, 279, 539, 1036, 2011, 3883", 0);
  }
}
