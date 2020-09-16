package irvine.oeis.a034;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;

import irvine.math.group.Monster;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034389 Multiplicity of highest weight (or singular) vectors associated with character chi_1 of Monster module.
 * @author Sean A. Irvine
 */
public class A034389 implements Sequence {

  private List<Z> newList() {
    final ArrayList<Z> res = new ArrayList<>();
    res.add(Z.ONE);
    res.add(Z.ZERO);
    return res;
  }

  private Map<String, List<Z>> getMoonshine() {
    final Map<String, List<Z>> res = new HashMap<>();
    try (final BufferedReader reader = new BufferedReader(new InputStreamReader(new GZIPInputStream(new FileInputStream("/home/sean/moonshine.dat.gz"))))) {
      String line;
      while ((line = reader.readLine()) != null) {
        final String[] parts = line.split("\\s+");
        final List<Z> lst = res.computeIfAbsent(parts[0], k -> newList());
        lst.add(new Z(parts[2]));
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    return res;
  }

  private final String[] mClasses = {"1A", "2A", "2B", "3A", "3B", "3C", "4A", "4B", "4C", "4D", "5A", "5B", "6A", "6B", "6C", "6D", "6E", "6F", "7A", "7B", "8A", "8B", "8C", "8D", "8E", "8F", "9A", "9B", "10A", "10B", "10C", "10D", "10E", "11A", "12A", "12B", "12C", "12D", "12E", "12F", "12G", "12H", "12I", "12J", "13A", "13B", "14A", "14B", "14C", "15A", "15B", "15C", "15D", "16A", "16B", "16C", "17A", "18A", "18B", "18C", "18D", "18E", "19A", "20A", "20B", "20C", "20D", "20E", "20F", "21A", "21B", "21C", "21D", "22A", "22B", "23AB", "23AB", "24A", "24B", "24C", "24D", "24E", "24F", "24G", "24H", "24I", "24J", "25A", "26A", "26B", "27A", "27B", "28A", "28B", "28C", "28D", "29A", "30A", "30B", "30C", "30D", "30E", "30F", "30G", "31AB", "31AB", "32A", "32B", "33A", "33B", "34A", "35A", "35B", "36A", "36B", "36C", "36D", "38A", "39A", "39B", "39CD", "39CD", "40A", "40B", "40CD", "40CD", "41A", "42A", "42B", "42C", "42D", "44AB", "44AB", "45A", "46AB", "46AB", "46CD", "46CD", "47AB", "47AB", "48A", "50A", "51A", "52A", "52B", "54A", "55A", "56A", "56BC", "56BC", "57A", "59AB", "59AB", "60A", "60B", "60C", "60D", "60E", "60F", "62AB", "62AB", "66A", "66B", "68A", "69AB", "69AB", "70A", "70B", "71AB", "71AB", "78A", "78BC", "78BC", "84A", "84B", "84C", "87AB", "87AB", "88AB", "88AB", "92AB", "92AB", "93AB", "93AB", "94AB", "94AB", "95AB", "95AB", "104AB", "104AB", "105A", "110A", "119AB", "119AB"};


  private final Map<String, List<Z>> mMoonshine = getMoonshine();
  private int mN = -1;

  @Override
  public Z next() {
//    System.out.println("MM test");
//    final MemorySequence seq = Monster.mckayThompson(101);
//    for (int k = 0; k < 40; ++k) {
//      System.out.println(seq.a(k));
//    }

    assert mClasses.length == 194;
    if (++mN == 21) {

      return null;
    }
    Z r = Z.ZERO;
    int j = 1;
    for (final String s : mClasses) {
      //r = r.add(Monster.ORDER.divide(Monster.centralizerOrder(j)).multiply(Monster.chi(1, j)).multiply(mMoonshine.get(s).get(mN)));
      r = r.add(Monster.ORDER.divide(Monster.centralizerOrder(j)).multiply(Monster.chi(1, j)).multiply(Monster.mckayThompson(j).a(mN)));
      ++j;
    }
    //System.out.println(mN + " " + r + " " + r.divide(M));
    return r.divide(Monster.ORDER);
  }
}
