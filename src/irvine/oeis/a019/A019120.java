package irvine.oeis.a019;

import java.io.BufferedReader;
import java.io.IOException;

import irvine.oeis.a018.A018940;
import irvine.util.io.IOUtils;

/**
 * A019120 Cycle class sequence <code>c(n)</code> (number of true cycles of length n in which a certain node is included) for zeolite EUO <code>= EU-1</code> Nan <code>[ AlnSi112-n O224 ]</code>.
 * @author Sean A. Irvine
 */
public class A019120 extends A018940 {

  @Override
  protected int step() {
    return 1;
  }

  @Override
  protected String getNeighbourhoodDescription() {
    // EUO
    try (final BufferedReader reader = IOUtils.reader("irvine/oeis/a019/a019120.dat.gz")) {
      return IOUtils.readAll(reader);
    } catch (final IOException e) {
      throw new RuntimeException(e);
    }
  }
}

